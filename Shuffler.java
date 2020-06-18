import java.util.ArrayList;
import java.util.Random;

public class Shuffler {
    public Shuffler(int civilCount,
                    int mafiaCount,
                    int comissarCount,
                    int hoeCount,
                    int doctorCount,
                    int maniacCount)
    {
        m_slots = new ArrayList<>();
        m_random = new Random();

        m_slots.add(new ShufflerSlot(civilCount, new Role(MafiaClass.MafiaClassCivil)));
        m_slots.add(new ShufflerSlot(mafiaCount, new Role(MafiaClass.MafiaClassGang)));
        m_slots.add(new ShufflerSlot(comissarCount, new Role(MafiaClass.MafiaClassComissar)));
        m_slots.add(new ShufflerSlot(hoeCount, new Role(MafiaClass.MafiaClassHoe)));
        m_slots.add(new ShufflerSlot(doctorCount, new Role(MafiaClass.MafiaClassDoctor)));
        m_slots.add(new ShufflerSlot(maniacCount, new Role(MafiaClass.MafiaClassManiac)));
    }

    public Role getRole()
    {
        int index = m_random.nextInt(m_slots.size());

        Role role = m_slots.get(index).getRole();
        boolean dec = m_slots.get(index).decreaseCount();

        if (!dec)
        {
            m_slots.remove(index);
        }

        return role;
    }

    private ArrayList<ShufflerSlot> m_slots;
    private Random m_random;
}

public class Role {
    public Role (MafiaClass role)
    {
        m_role = role;
    }

    public Role (int index) {
        switch (index)
        {
            case 0:
                m_role = MafiaClass.MafiaClassCivil;
                break;
            case 1:
                m_role = MafiaClass.MafiaClassGang;
                break;
            case 2:
                m_role = MafiaClass.MafiaClassComissar;
                break;
            case 3:
                m_role = MafiaClass.MafiaClassHoe;
                break;
            default:
                m_role = MafiaClass.MafiaClassInvalid;
        }
    }

    public String getGreeting() {
        switch (m_role)
        {
            case MafiaClassCivil:
                return "I'm just a civil, don't touch me!";
            case MafiaClassGang:
                return "I'm the mafia itself, fear me!";
            case MafiaClassComissar:
                return "I'm the strict comissar, obey me!";
            case MafiaClassHoe:
                return "I'm the beautiful hoe, go play with me!";
            case MafiaClassDoctor:
                return "I'm the doctor, I can cure anyone!";
            case MafiaClassManiac:
                return "I'm the crazy maniac, I can kill anyone!";
            default:
                return "I don't know who I am...Fix your code please";
        }
    }

    public String toString()
    {
        switch (m_role)
        {
            case MafiaClassCivil:
                return "Civil";
            case MafiaClassGang:
                return "Mafia";
            case MafiaClassComissar:
                return "Comissar";
            case MafiaClassHoe:
                return "Hoe";
            case MafiaClassDoctor:
                return "Doctor";
            case MafiaClassManiac:
                return "Maniac";
            default:
                return "???";
        }
    }

    public MafiaClass getRole()
    {
        return m_role;
    }

    private MafiaClass m_role;
}

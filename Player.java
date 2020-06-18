public class Player {

    public Player()
    {
        m_index = 0;
        m_role = new Role(MafiaClass.MafiaClassInvalid);
    }

    public Player(int index, Role role)
    {
        m_index = index;
        m_role = role;
    }

    public String getGreeting()
    {
        return m_role.getGreeting();
    }

    public String getRole()
    {
        return m_role.toString();
    }

    private int m_index;
    private Role m_role;
}

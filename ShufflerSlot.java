public class ShufflerSlot {

    public ShufflerSlot(int count, Role role)
    {
        m_count = count;
        m_role = role;
    }

    public boolean decreaseCount()
    {
        --m_count;
        return m_count != 0;
    }

    public Role getRole()
    {
        return m_role;
    }

    private int m_count;
    private Role m_role;
}

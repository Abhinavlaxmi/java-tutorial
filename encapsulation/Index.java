class Subject
{
    private int id;
    private String name;
    private String subCode;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSubCode() {
        return subCode;
    }
    public void setSubCode(String subCode) {
        this.subCode = subCode;
    }

    
};

class Index
{
    public static void main(String arg[])
    {
        Subject sub = new Subject();
        sub.setId(01);
        sub.setName("Physics");
        sub.setSubCode("phy01");
        System.out.println(sub.getName() +" whose subject code is " + sub.getSubCode() + " and id is "+ sub.getId());
    }
}


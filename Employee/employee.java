package EMPLOYEE;

public class Main {
    public static void main(String[] args){


    }
}

public class employee{
    protected String name;
    protected int employeeID;

    employee(){

    }

    public void display(){
        System.out.println("DISPLAY");
    }
}

public class salesManager extends employee {
    super();
    public void boostSales(){

    }
}

public class marketingManager extends employee{
    super();

    public void createMarketingStrategy(){

    }
}

public class executive extends employee {
    super();
    public void makeDecisions(){

    }
}

public class developer extends employee{
    super();
    private String programmingLang;
    public void show(){

    }
}

public class HRmanager extends employee{
    super(){

    }
    public void handleHRDuties(){

    }
}

public class techLead extends employee{
    super();

    public void displayInfo(){

    }
}

public class CEO extends Executive {
    super();

    public void leadCompany(){

    }
}

public class HRdirector extends HRmanager{
    super();

    public void manageHRdept(){
        
    }
}

public class ProjectManager extends techLead{
    super();
    protected String projectManaged;
    public void manageProject(){

    }
}

public class TeamLead extends techLead{
    super();
    protected int teamsize;
    public void leadTeam(){
        
    }
}


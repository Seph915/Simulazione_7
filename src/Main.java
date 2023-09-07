public class Main {
    public static void main(String[] args) {
        Secretary[] secretaries = new Secretary[3];
        secretaries[0] = new Secretary("gianni", "rossi", 10);
        secretaries[1] = new Secretary("franco", "verdi", 11);
        secretaries[2] = new Secretary("jim", "smith", 12);

        printMrsSmithDepartment(secretaries);

        for (Secretary secretary : secretaries){
            if (secretary.getDepartmentId() > 10){
                System.out.println(secretary.getFirstName());
            }
        }
    }

    static void printMrsSmithDepartment(Secretary[] secretaries) {
        for (Secretary secretary : secretaries) {
            String lastName = secretary.getLastName();
            long deparment = secretary.getDepartmentId();
            //System.out.println(secretary.getDepartmentId());
            if (secretary.getLastName().equals("smith")) {
                System.out.println("departmentId" + " " + secretary.getDepartmentId());
            }
        }
    }
}

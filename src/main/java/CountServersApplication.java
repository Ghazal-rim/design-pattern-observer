import java.util.*;

public class CountServersApplication {

    public static void main(String[] args) {

        Application application1 = new Application(10);
        Application application2 = new Application(5);

        Map<Integer,Application> applicationMap = new HashMap<>();
        applicationMap.put(10,application1);
        applicationMap.put(5,application2);

         new ApplicationDeployment(application1);
         new ApplicationDeployment(application2);

         String command = "x";
        while(true){
            System.out.println("Veuillez choisir l'id de l'application que vous voulez modifier :");
            Scanner sc = new Scanner(System.in);
            command = sc.nextLine();
            if(command.equals("exit")) break;
            int id = Integer.valueOf(command);
            System.out.println("Veuillez entrer le nouveau nombre d'untilisateurs");
            if (applicationMap.containsKey(id)) {
                int nbUsers = sc.nextInt();
                Application applicationUpdated = applicationMap.get(id);
                applicationUpdated.setUsers(nbUsers);
            }
        }

    }
}

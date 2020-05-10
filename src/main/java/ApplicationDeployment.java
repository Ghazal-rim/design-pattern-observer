public class ApplicationDeployment implements Observer{

    private int nbServers;
    private final Application application;

    public ApplicationDeployment(Application application) {
        this.application = application;
        application.subscribe(this);
    }


    public void coutServers() {
        int users = this.application.getUsers();
        if (users > 0 && users < 10) {
            nbServers = 1;
        } else if (users >= 10 && users < 50) {
            nbServers = 2;
        } else if (users >= 50 && users < 100) {
            nbServers = 3;
        }
        System.out.println("Le nombre de serveurs pour cette application est : " + nbServers);
    }

    @Override
    public void update() {
        coutServers();

    }
}

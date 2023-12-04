package FirstExample;

//client logged in the system
public class ClientLogged implements IClient{

    private int location;


    @Override
    public void setLocation(int location) {
        this.location = location;
    }

    public int getLocation() {
        return location;
    }

    @Override
    public void requestDrive() {

    }
}

package Day5;

interface ElectronicDevice {
    void turnoff();
    void turnon();
}
interface Display{
    void DisplayDevice();
}
class Telvision implements ElectronicDevice,Display{
    @Override
    public void turnoff(){
        System.out.println("The TV is Turnoff");
    }
    @Override
    public void turnon(){
        System.out.println("The TV is TurnOn");
    }
    public void DisplayDevice(){
        System.out.println("Display");
    }
}
//concrete class
class Smartphone implements ElectronicDevice,Display{
    @Override
    public void turnoff(){
        System.out.println("Booting off");
    }
    @Override
    public void turnon(){
        System.out.println("Booting On");
    }
    public void DisplayDevice(){
        System.out.println("Display");
    }
}
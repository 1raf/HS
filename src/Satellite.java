
public class Satellite {
    private static Satellite _instance;
    private Satellite(){}

    private static class SatelliteHelper{
        private static final Satellite _innerInstance = new Satellite();
    }

    public static  Satellite getSatellite(){
        return SatelliteHelper._innerInstance;
    }

    //Lazy initialization.
    public static Satellite getLazySatellite(){
        if(_instance == null){
            _instance = new Satellite();
        }
        return _instance;
    }
}



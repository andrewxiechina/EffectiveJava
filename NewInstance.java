// Service Provider Pattern, features static methods

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
interface Service {

}

interface Provider {
    Service newService();
}

class Services {
    private Services() {
    }

    private static final Map<String, Provider> providers = new ConcurrentHashMap<>();

    public static void registerProvider(String name, Provider p) {
        providers.put(name, p);
    }

    public static Service newInstance(String name) {
        Provider p = providers.get(name);
        return p.newService();
    }
}

public class NewInstance {
    private static Provider COMP_PROVIDER = new Provider() {
        @Override
        public Service newService() {
            return new Service() {
                @Override
                public String toString() {
                    return "Complementary Service";
                }
            };
        }
    };
    public static void main(String[] args){
        Services.registerProvider("comp", COMP_PROVIDER);
        Service s = Services.newInstance("comp");
        System.out.println(s);
    }
}

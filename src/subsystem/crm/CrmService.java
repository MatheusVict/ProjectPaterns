package subsystem.crm;

public class CrmService {
  private CrmService() {
    super();
  }

  public static void saveClient(String name, String cep, String state, String city) {
    System.out.println("Saving client " + name + " with CEP " + cep + " in " + city + "/" + state);
  }
}

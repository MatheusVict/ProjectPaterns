package subsystem.cep;

public class CepAPI {
  private static CepAPI INSTANCE = new CepAPI();

  private CepAPI() {
    super();
  }

  public static CepAPI getInstance() {
    return INSTANCE;
  }

  public String getCity(String cep) {
    return "Recife";
  }

  public String getState(String cep) {
    return "PE";
  }
}

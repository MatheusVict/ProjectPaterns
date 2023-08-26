package dev.matheusvictor.gof.facade;

import subsystem.cep.CepAPI;
import subsystem.crm.CrmService;

public class Facade {

  public void migrateClient(String name, String cep) {
    String city = CepAPI.getInstance().getCity(cep);
    String state = CepAPI.getInstance().getState(cep);
    CrmService.saveClient(name, cep, state, city);
  }
}

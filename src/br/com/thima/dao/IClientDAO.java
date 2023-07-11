package br.com.thima.dao;

import br.com.thima.domain.Client;

import java.util.Collection;

public interface IClientDAO {
    public Boolean register(Client client);

    public void delete(Long cpf);
    public void alter(Client client);
    public Client consult(Long cpf);
    public Collection<Client> searchAll();
}

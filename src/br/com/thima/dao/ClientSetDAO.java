package br.com.thima.dao;

import br.com.thima.domain.Client;

import java.util.Collection;

public class ClientSetDAO implements IClientDAO{

    @Override
    public Boolean register(Client client) {
        return null;
    }

    @Override
    public void delete(Long cpf) {

    }

    @Override
    public void alter(Client client) {

    }

    @Override
    public Client consult(Long cpf) {
        return null;
    }

    @Override
    public Collection<Client> searchAll() {
        return null;
    }
}

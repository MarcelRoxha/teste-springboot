package com.example.demospringfirestore.service.impl;

import com.example.demospringfirestore.commons.GenericServiceImpl;
import com.example.demospringfirestore.dto.ClienteDTO;
import com.example.demospringfirestore.dto.PersonaDTO;
import com.example.demospringfirestore.model.Cliente;
import com.example.demospringfirestore.model.Persona;
import com.example.demospringfirestore.service.api.ClienteAPI;
import com.example.demospringfirestore.service.api.PersonaServiceAPI;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.Firestore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServicelmpl  extends GenericServiceImpl<Cliente, ClienteDTO> implements ClienteAPI {

    @Autowired
    private Firestore firestore;

    @Override
    public CollectionReference getCollection() {
        return firestore.collection("CLIENTES");
    }
}
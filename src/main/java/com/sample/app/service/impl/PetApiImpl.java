/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample.app.service.impl;

import com.sample.app.dto.ApiResponseDTO;
import com.sample.app.dto.PetDTO;
import com.sample.app.service.PetApi;
import com.sun.xml.internal.ws.api.message.Attachment;
import java.io.InputStream;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author kawabata
 */
@Stateless
public class PetApiImpl implements PetApi {

    @Override
    public void addPet(PetDTO body) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletePet(Long petId, String apiKey) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PetDTO> findPetsByStatus(List<String> status) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PetDTO> findPetsByTags(List<String> tags) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PetDTO getPetById(Long petId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updatePet(PetDTO body) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updatePetWithForm(Long petId, String name, String status) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ApiResponseDTO uploadFile(Long petId, String additionalMetadata, InputStream fileInputStream, Attachment fileDetail) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

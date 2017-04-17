package com.ethiohub.service;

import com.ethiohub.dao.DaoImpl;
import com.ethiohub.domain.UserSignUpRequest;
import com.ethiohub.entity.SeekerProfile;
import com.ethiohub.exception.UserManagmentServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by addis on 4/17/17.
 */
@Transactional
@Service
public class UserManagementServiceimpl implements UserManagementService{

    @Autowired
    DaoImpl dao;

    private boolean isExists(UserSignUpRequest userSignUpRequest) throws UserManagmentServiceException{

        SeekerProfile seekerProfile=new SeekerProfile();
        seekerProfile.setFirstName(userSignUpRequest.);

    }

    @Override
    public Integer registerUser(UserSignUpRequest userSignUpRequest) throws UserManagmentServiceException {
        return null;
    }
}

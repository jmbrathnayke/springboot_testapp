package com.manuj.testapp.service;
import com.manuj.testapp.dto.UserDto;
import com.manuj.testapp.model.UserModel;
import com.manuj.testapp.repo.UserRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ModelMapper modelMapper;


    public List<UserDto> getAllUsers(){
        List<UserModel>userList = userRepo.findAll();
        return modelMapper.map(userList, new TypeToken<List<UserDto>>(){}.getType());
        }
    }


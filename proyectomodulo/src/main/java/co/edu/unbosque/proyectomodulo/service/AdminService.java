package co.edu.unbosque.proyectomodulo.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import co.edu.unbosque.proyectomodulo.repository.AdminRepository;

public class AdminService implements CRUDOPERATION<AdminDTO> {

	@Autowired // inicializa el objeto
	private AdminRepository parejaRep;
	@Autowired
	private ModelMapper mapper;

}

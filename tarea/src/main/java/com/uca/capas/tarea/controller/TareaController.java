package com.uca.capas.tarea.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Date; 
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TareaController {
	
	@RequestMapping("/ingresar")
	public String index() {
		
		 
		return "commons/index";
	}
	
	@RequestMapping("/parametros")
	public ModelAndView parametros(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String fecha_nac = request.getParameter("fecha_nac");
		String lugar_nac = request.getParameter("lugar_nac");
		String instituto = request.getParameter("instituto");
		String tel_fijo = request.getParameter("tel_fijo");
		String tel_movil = request.getParameter("tel_movil");
		
		
		mav.addObject("nombre", nombre);
		mav.addObject("apellido", apellido);
		mav.addObject("fecha_nac", fecha_nac);
		mav.addObject("lugar_nac", lugar_nac);
		mav.addObject("instituto", instituto);
		mav.addObject("tel_fijo", tel_fijo);
		mav.addObject("tel_movil", tel_movil);
		
		mav.setViewName("clases/clase10/resultado");
		return mav;
		
	}
	@RequestMapping("/parametros1")
	public ModelAndView parametros1(HttpServletRequest request) throws ParseException {
		ModelAndView mav = new ModelAndView();
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String fecha_nac = request.getParameter("fecha_nac");
		String lugar_nac = request.getParameter("lugar_nac");
		String instituto = request.getParameter("instituto");
		String tel_fijo = request.getParameter("tel_fijo");
		String tel_movil = request.getParameter("tel_movil");
		
	
		
		// Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(fecha_nac);  

		String error1="El campo Nombre debe de ser de mínimo 1 carácter y máximo 25 caracteres";
		String error2="El campo Apellido debe de ser de mínimo 1 carácter y máximo 25 caracteres";
		String error3="El campo Lugar de Nacimiento debe de ser de mínimo 1 carácter y máximo 25 caracteres";
		String error4="El campo instituto debe de ser de 8 números exactamente";
		String error5="El campo Telefono fijo debe de ser de 8 números exactamente";
		String error6="El campo Telefono Movil debe de ser de 8 números exactamente";
		String correcto="Alumno ingresado con exito";
		

		List<String> lista = new ArrayList<>();
		
		if(nombre.length() > 25||nombre.length()<1) {
			lista.add(error1);
			if(apellido.length()>25||apellido.length()<1) {
				lista.add(error2);}
			if(lugar_nac.length()>25||lugar_nac.length()<1) {
				lista.add(error3);}
			if(instituto.length()>100||instituto.length()<1) {
				lista.add(error4);}
			if(tel_fijo.length()>8||tel_fijo.length()<8) {
				lista.add(error5);}
			if(tel_movil.length()>8||tel_movil.length()<8) {
				lista.add(error6);}
			
			
			
		} else if(apellido.length()>25||apellido.length()<1) {
			lista.add(error2);
			if(lugar_nac.length()>25||lugar_nac.length()<1) {
				lista.add(error3);}
			if(instituto.length()>100||instituto.length()<1) {
				lista.add(error4);}
			if(tel_fijo.length()>8||tel_fijo.length()<8) {
				lista.add(error5);}
			if(tel_movil.length()>8||tel_movil.length()<8) {
				lista.add(error6);}
			
		
		}else if(lugar_nac.length()>25||lugar_nac.length()<1) {
			lista.add(error3);
			if(instituto.length()>100||instituto.length()<1) {
				lista.add(error4);}
			if(tel_fijo.length()>8||tel_fijo.length()<8) {
				lista.add(error5);}
			if(tel_movil.length()>8||tel_movil.length()<8) {
				lista.add(error6);}
			
			
		}else if(instituto.length()>100||instituto.length()<1) {
			lista.add(error4);
			if(tel_fijo.length()>8||tel_fijo.length()<8) {
				lista.add(error5);}
			if(tel_movil.length()>8||tel_movil.length()<8) {
				lista.add(error6);}
			
			
		}else if(tel_fijo.length()>8||tel_fijo.length()<8) {
			lista.add(error5);
			if(tel_movil.length()>8||tel_movil.length()<8) {
				lista.add(error6);}
			
		}else if(tel_movil.length()>8||tel_movil.length()<8) {
			lista.add(error6);
		} else
			lista.add(correcto);
		
		
		mav.addObject("lista", lista);
		mav.setViewName("clases/clase10/resultado");
		return mav;
		
	}

	


}

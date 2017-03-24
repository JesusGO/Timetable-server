package com.jolivas;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

@Controller
public class DataBaseUsage implements CommandLineRunner{
	
	@Autowired
	private AlumnosRepository alumnos;
	
	@Autowired
	private ClasesRepository clases;
	
	@Autowired
	private HorariosRepository horarios;
		
	@Override
	public void run(String... args) throws Exception{
		Horario L01=new Horario(Day.LUNES,Hora.PRIMERA);
		Horario L02=new Horario(Day.LUNES,Hora.SEGUNDA);
		Horario L03=new Horario(Day.LUNES,Hora.TERCERA);
		horarios.save(L01);
		horarios.save(L02);
		horarios.save(L03);
		Horario M01=new Horario(Day.MARTES,Hora.PRIMERA);
		Horario M02=new Horario(Day.MARTES,Hora.SEGUNDA);
		Horario M03=new Horario(Day.MARTES,Hora.TERCERA);
		horarios.save(M01);
		horarios.save(M02);
		horarios.save(M03);
		Horario X01=new Horario(Day.MIERCOLES,Hora.PRIMERA);
		Horario X02=new Horario(Day.MIERCOLES,Hora.SEGUNDA);
		Horario X03=new Horario(Day.MIERCOLES,Hora.TERCERA);
		horarios.save(X01);
		horarios.save(X02);
		horarios.save(X03);
		Horario J01=new Horario(Day.JUEVES,Hora.PRIMERA);
		Horario J02=new Horario(Day.JUEVES,Hora.SEGUNDA);
		Horario J03=new Horario(Day.JUEVES,Hora.TERCERA);
		horarios.save(J01);
		horarios.save(J02);
		horarios.save(J03);
		Horario V01=new Horario(Day.VIERNES,Hora.PRIMERA);
		Horario V02=new Horario(Day.VIERNES,Hora.SEGUNDA);
		Horario V03=new Horario(Day.VIERNES,Hora.TERCERA);
		horarios.save(V01);
		horarios.save(V02);
		horarios.save(V03);

        
		Clase algebra= new Clase("Álgebra lineal y matemática discreta","305","Aulario III","Teresa",new ArrayList<>(Arrays.asList(L01, X01)));
		clases.save(algebra);
		
		Clase expresion =new Clase("Expresión oral y escrita y búsqueda de información","305","Aulario III","Juan",new ArrayList<>(Arrays.asList(L02, J02)));
		clases.save(expresion);
		
		Clase organi=new Clase("Organización empresarial y recursos humanos","305","Aulario III","Jesus",new ArrayList<>(Arrays.asList(M01, V02)));
		clases.save(organi);
		
		Clase funda=new Clase("Fundamentos de la programación","305","Aulario III","Nemo",new ArrayList<>(Arrays.asList(M02, X02)));
		clases.save(funda);
		
		Clase calculo=new Clase("Cálculo y análisis diferencial","305","Aulario III","Irene",new ArrayList<>(Arrays.asList(J01, V01)));
		clases.save(calculo);
		
		Clase estadi=new Clase("Estadística","304","Aulario III","Miguel Angel",new ArrayList<>(Arrays.asList(L02, M02)));
		clases.save(estadi);
		Clase ampli=new Clase("Ampliación de señales y sistemas","304","Aulario III","Marques",new ArrayList<>(Arrays.asList(L03, J03)));
		clases.save(ampli);
		Clase siste=new Clase("Programación de sistemas de telecomunicación","304","Aulario III","Centeno",new ArrayList<>(Arrays.asList(M03, J02)));
		clases.save(siste);
		Clase electro=new Clase("Electrónica","304","Aulario III","Carla",new ArrayList<>(Arrays.asList(X02, V02)));
		clases.save(electro);
		Clase campos=new Clase("Campos electromagnéticos","304","Aulario III","Julio",new ArrayList<>(Arrays.asList(X03, V03)));
		clases.save(campos);
		
		Clase tim=new Clase("Tratamiento de información multimedia","Seminario 127","Departamental I","Inma",new ArrayList<>(Arrays.asList(L01, X02)));
		clases.save(tim);
		Clase so=new Clase("Sistemas Operativos","Seminario 127","Departamental I","Soriano",new ArrayList<>(Arrays.asList(L02, X03)));
		clases.save(so);
		Clase arqui=new Clase("Arquitectura de sistemas de telecomunicación","Seminario 008","Departamental I","Oscar",new ArrayList<>(Arrays.asList(M01, V01)));
		clases.save(arqui);
		Clase tdigi=new Clase("Transmisión digital","L3202","Laboratorio III","Carla",new ArrayList<>(Arrays.asList(M02, J01)));
		clases.save(tdigi);
		Clase arquicomp=new Clase("Arquitectura de computadores","218","Aulario II","Cañas",new ArrayList<>(Arrays.asList(J02, V02)));
		clases.save(arquicomp);
		
		Clase sdistri=new Clase("Sistemas distribuidos","Seminario 004","Departamental I","Gorka",new ArrayList<>(Arrays.asList(X02, J03)));
		clases.save(sdistri);
		Clase lab=new Clase("Laboratorio de administración y gestión de redes y sistemas","Departamental I","Aulario II","Jose Maria",new ArrayList<>(Arrays.asList(X03, J02)));
		clases.save(lab);
		
		Alumno alumno01=new Alumno("Jesus",new ArrayList<>(Arrays.asList(algebra,expresion,organi,funda,calculo)));
		alumnos.save(alumno01);
		
		Alumno alumno02=new Alumno("Juan",new ArrayList<>(Arrays.asList(estadi,ampli,siste,electro,campos)));
		alumnos.save(alumno02);
		
		Alumno alumno03=new Alumno("Soraya",new ArrayList<>(Arrays.asList(tim,so,arqui,tdigi,arquicomp)));
		alumnos.save(alumno03);
		
		Alumno alumno04=new Alumno("Pedro Olivas",new ArrayList<>(Arrays.asList(sdistri,lab)));
		alumnos.save(alumno04);
		
	}

}

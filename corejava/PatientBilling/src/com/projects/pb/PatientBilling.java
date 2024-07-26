package com.projects.pb;

import com.projects.pc.PatientClinicals;
import com.projects.pr.PatientRegistration;

public class PatientBilling {
	public static void main(String[] args) {
		PatientRegistration pr = new PatientRegistration();
		pr.getPatientDetails();
		PatientClinicals pc = new PatientClinicals();
		pc.clinic();
	}

	public void bill() {
		System.out.println("billing details");
	}
}

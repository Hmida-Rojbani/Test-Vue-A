package de.tekup.vue.dto.models;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter@Setter
@ToString
public class User {

	private String name;
	private String email;
	private String password;
	
	// add theses fields to HTML
	private String gender;
	private String note;
	private boolean married;
	private LocalDate birthDate;
	private String profession;
}

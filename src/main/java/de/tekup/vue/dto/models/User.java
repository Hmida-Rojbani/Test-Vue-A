package de.tekup.vue.dto.models;

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
}

package br.com.cesarschool.dumpeeapi.entities;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {

  @Id
  private int id;

  private String name;

  private String pronouns;

  @OneToMany
  private Waste discards;

  private float points;
}

package br.com.cesarschool.dumpeeapi.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "db_student")
public class Student {

  @Id
  @Column(name = "ID")
  private int id;

  @Column(name = "NAME")
  private String name;

  @Column(name = "PRONOUNS")
  private String pronouns;

  @OneToMany
  @JoinColumn(name = "DISCARD_CODE")
  private Item discards;

  @Column(name = "POINTS")
  private long points;
}

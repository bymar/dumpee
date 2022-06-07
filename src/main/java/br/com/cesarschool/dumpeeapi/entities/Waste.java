package br.com.cesarschool.dumpeeapi.entities;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Waste {

  @Id
  private int id;

  @OneToOne
  private WasteType wasteType;

  @OneToOne
  private WasteBrand wasteBrand;

  private LocalDate fabricationYear;

  private boolean condition;

  private boolean working;
}

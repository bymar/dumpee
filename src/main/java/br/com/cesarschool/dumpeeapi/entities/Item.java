package br.com.cesarschool.dumpeeapi.entities;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "dp_item")
public class Item {

  @Id
  @Column(name = "ID")
  private int id;

  @OneToOne
  @JoinColumn(name = "TYPE_CODE", referencedColumnName = "CODE")
  private ItemType itemType;

  @OneToOne
  @JoinColumn(name = "BRAND_CODE", referencedColumnName = "CODE")
  private ItemBrand itemBrand;

  @Column(name = "FABRICATION")
  private LocalDate fabricationYear;

  @Column(name = "ITEM_CONDITION")
  private boolean condition;

  @Column(name = "ITEM_WORKING")
  private boolean working;

  @ManyToOne
  @JoinColumn(name = "STUDENT_CODE", referencedColumnName = "DISCARD_CODE")
  private Student oldOwner;
}

package br.com.cesarschool.dumpeeapi.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentBasicData {

  private int id;

  private String studentName;

  private String studentPronouns;
}

package br.com.cesarschool.dumpeeapi.controller.response;

import br.com.cesarschool.dumpeeapi.data.StudentBasicData;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class StudentResponse {

  private List<StudentBasicData> getStudentData;

}

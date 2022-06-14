package br.com.cesarschool.dumpeeapi.controller.response;

import br.com.cesarschool.dumpeeapi.entities.Item;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class ItemResponse {

  private List<Item> getItem;
}

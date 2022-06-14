package br.com.cesarschool.dumpeeapi.repository;

import br.com.cesarschool.dumpeeapi.entities.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, String> {

}

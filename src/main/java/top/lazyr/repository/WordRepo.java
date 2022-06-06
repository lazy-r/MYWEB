package top.lazyr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import top.lazyr.model.po.Word;

/**
 * @author lazyr
 * @created 2022/4/30
 */
public interface WordRepo extends JpaRepository<Word, Long>, JpaSpecificationExecutor<Word> {
}

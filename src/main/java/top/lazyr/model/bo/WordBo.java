package top.lazyr.model.bo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * @author lazyr
 * @created 2021/5/10
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class WordBo {
    private Long id;
    private String word;
    private String translation;
    private int searchCount;
}

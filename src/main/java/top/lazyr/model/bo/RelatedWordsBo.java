package top.lazyr.model.bo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

/**
 * @author lazyr
 * @created 2021/5/10
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class RelatedWordsBo {
    private Long id;
    private List<String> words;
    private int searchCount;
    private int userDefined;
}

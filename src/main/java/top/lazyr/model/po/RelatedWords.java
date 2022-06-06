package top.lazyr.model.po;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Proxy;

import javax.persistence.*;

/**
 * @author lazyr
 * @created 2021/4/27
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "related_words")
@Proxy(lazy = false)
public class RelatedWords {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "words")
    private String words;
    @Column(name = "search_count")
    private int searchCount;
    @Column(name = "is_user_defined")
    private int userDefined;
    @Column(name = "is_deleted")
    private  int deleted;
}

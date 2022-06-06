package top.lazyr.model.po;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Proxy;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * @author lazyr
 * @created 2021/4/27
 */
@Proxy(lazy = false)
//@Data
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Builder
@Table(name = "word")
public class Word {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "word")
    private String word;
    @Column(name = "translation")
    private String translation;
    @Column(name = "search_count")
    private int searchCount;
    @Column(name = "recent_time_modified")
    private Timestamp recentTimeModified;
}

package top.lazyr.myweb.model.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.hibernate.annotations.Proxy;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "word")
@Proxy(lazy = false)
public class MyWord {
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

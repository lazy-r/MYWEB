package top.lazyr.myweb.model.pojo;


import lombok.*;
import lombok.experimental.Accessors;
import org.hibernate.annotations.Proxy;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.sql.Timestamp;

@Proxy(lazy = false)
//@Data
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Builder
@Table(name = "dictionary")
public class MyDictionary {
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

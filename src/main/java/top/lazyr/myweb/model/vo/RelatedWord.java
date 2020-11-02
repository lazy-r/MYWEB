package top.lazyr.myweb.model.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RelatedWord {
    private Long id;
    private String[] highlightWords;
    private String[] words;
    private int searchCount;
}

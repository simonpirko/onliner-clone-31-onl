package by.tms.onlinerclone31onl.domain;


import lombok.*;


import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Product {

    private Long productId;
    private String name;
    private String description;
    private String characteristic;
    private Integer year;
    private Category category;
    private Manufacturer manufacturer;
    private List<String> images;
}

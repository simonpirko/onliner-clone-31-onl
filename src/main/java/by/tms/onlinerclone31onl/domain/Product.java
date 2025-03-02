package by.tms.onlinerclone31onl.domain;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Product {

    private String productId;
    private String name;
    private String description;
    private String characteristic;
    private Integer year;
    private Category category;
    private Manufacturer manufacturer;

}

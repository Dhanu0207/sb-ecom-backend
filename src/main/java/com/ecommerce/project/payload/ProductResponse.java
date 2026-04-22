package com.ecommerce.project.payload;

import com.ecommerce.project.model.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductResponse {
    private List<ProductDTO> content;
    private Integer pageNumber;
    private Integer pageSize;
    private Long totalElements;
    private Integer totalPages;
    private boolean lastPage;
    private String sortBy;
    private String sortOrder;

}

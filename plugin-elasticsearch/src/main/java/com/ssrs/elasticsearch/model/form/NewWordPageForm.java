package com.ssrs.elasticsearch.model.form;

import com.ssrs.framework.web.swaggermodel.PageForm;
import lombok.Data;

/**
 * @author ssrs
 */
@Data
public class NewWordPageForm extends PageForm {
    private String word;
}

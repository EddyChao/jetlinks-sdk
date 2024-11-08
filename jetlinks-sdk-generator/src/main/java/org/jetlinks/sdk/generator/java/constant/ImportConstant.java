package org.jetlinks.sdk.generator.java.constant;

public interface ImportConstant {

    /**
     * Column注解路径
     */
    String COLUMN = "javax.persistence.Column";

    /**
     * DefaultValue注解路径
     */
    String DEFAULT_VALUE = "org.hswebframework.ezorm.rdb.mapping.annotation.DefaultValue";

    /**
     * ColumnType注解路径
     */
    String COLUMN_TYPE = "org.hswebframework.ezorm.rdb.mapping.annotation.ColumnType";

    /**
     * Table注解路径
     */
    String TABLE = "javax.persistence.Table";

    /**
     * EnableEntityEvent注解路径
     */
    String ENABLE_ENTITY_EVENT = "org.hswebframework.web.crud.annotation.EnableEntityEvent";

    /**
     * Size注解路径
     */
    String SIZE = "javax.validation.constraints.Size";

    /**
     * Pattern注解路径
     */
    String PATTERN = "javax.validation.constraints.Pattern";

    /**
     * Max注解路径
     */
    String MAX = "javax.validation.constraints.Max";

    /**
     * Min注解路径
     */
    String MIN = "javax.validation.constraints.Min";

    /**
     * Getter注解路径
     */
    String GETTER = "lombok.Getter";

    /**
     * Setter注解路径
     */
    String SETTER = "lombok.Setter";

    /**
     * RecordCreationEntity接口路径
     */
    String RECORD_CREATION_ENTITY = "org.hswebframework.web.api.crud.entity.RecordCreationEntity";

    /**
     * RecordModifierEntity接口路径
     */
    String RECORD_MODIFIER_ENTITY = "org.hswebframework.web.api.crud.entity.RecordModifierEntity";

    /**
     * GenericEntity导入路径
     */
    String GENERIC_ENTITY = "org.hswebframework.web.api.crud.entity.GenericEntity";

    /**
     * Schema导入路径
     */
    String SCHEMA = "io.swagger.v3.oas.annotations.media.Schema";

}
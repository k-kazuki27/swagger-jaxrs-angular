package com.sample.app.dto;

import com.sample.app.dto.CategoryDTO;
import com.sample.app.dto.TagDTO;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PetDTO  implements Serializable {
  
  private @Valid Long id = null;
  private @Valid CategoryDTO category = null;
  private @Valid String name = null;
  private @Valid List<String> photoUrls = new ArrayList<>();
  private @Valid List<TagDTO> tags = new ArrayList<>();

public enum StatusEnum {

    AVAILABLE(String.valueOf("available")), PENDING(String.valueOf("pending")), SOLD(String.valueOf("sold"));


    private String value;

    StatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static StatusEnum fromValue(String v) {
        for (StatusEnum b : StatusEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  private @Valid StatusEnum status = null;

  /**
   **/
  public PetDTO id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   **/
  public PetDTO category(CategoryDTO category) {
    this.category = category;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("category")
  public CategoryDTO getCategory() {
    return category;
  }
  public void setCategory(CategoryDTO category) {
    this.category = category;
  }

  /**
   **/
  public PetDTO name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "doggie", required = true, value = "")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public PetDTO photoUrls(List<String> photoUrls) {
    this.photoUrls = photoUrls;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("photoUrls")
  @NotNull
  public List<String> getPhotoUrls() {
    return photoUrls;
  }
  public void setPhotoUrls(List<String> photoUrls) {
    this.photoUrls = photoUrls;
  }

  /**
   **/
  public PetDTO tags(List<TagDTO> tags) {
    this.tags = tags;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("tags")
  public List<TagDTO> getTags() {
    return tags;
  }
  public void setTags(List<TagDTO> tags) {
    this.tags = tags;
  }

  /**
   * pet status in the store
   **/
  public PetDTO status(StatusEnum status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "pet status in the store")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PetDTO pet = (PetDTO) o;
    return Objects.equals(id, pet.id) &&
        Objects.equals(category, pet.category) &&
        Objects.equals(name, pet.name) &&
        Objects.equals(photoUrls, pet.photoUrls) &&
        Objects.equals(tags, pet.tags) &&
        Objects.equals(status, pet.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, category, name, photoUrls, tags, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PetDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    photoUrls: ").append(toIndentedString(photoUrls)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


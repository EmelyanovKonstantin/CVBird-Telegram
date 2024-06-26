package ai.cvbird.cvbirdtelegram.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import feign.form.FormProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class JobRequest {

    @FormProperty("job_id")
    @JsonProperty("job_id")
    String jobId;

}

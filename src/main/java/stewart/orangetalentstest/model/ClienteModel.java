package stewart.orangetalentstest.model;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.br.CPF;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

//lombok
@Getter
@Setter
//lombok, argumentos do construtor
@AllArgsConstructor
@NoArgsConstructor

//JPA
@Entity
@Table(name="clientesbanco")
public class ClienteModel {

  //JPA
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  @CPF
  private Long cpf;
  @NotEmpty
   private String name;
  @Pattern(regexp="^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[AZa-z0-9]+)*(\\.[A-Za-z]{2,})$")
  private String email;
  //@NotEmpty
  @JsonFormat(pattern = "dd/MM/yyyy")
  private LocalDate data;
}


package XPence.XPence.Repository;

import XPence.XPence.Model.ConfirmationToken;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfirmationTokenRepository extends JpaRepository<ConfirmationToken, Long> {
Optional<ConfirmationToken> findConfirmationTokenById(String token);
}
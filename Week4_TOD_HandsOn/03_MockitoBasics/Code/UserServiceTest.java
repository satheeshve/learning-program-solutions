import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class UserRepository {
    String findUsernameById(int id) { return "dummy"; }
}

class UserService {
    UserRepository repo;
    UserService(UserRepository r) { this.repo = r; }
    String getUsername(int id) { return repo.findUsernameById(id); }
}

public class UserServiceTest {

    @Test
    void testGetUsername() {
        UserRepository mockRepo = mock(UserRepository.class);
        when(mockRepo.findUsernameById(1)).thenReturn("Satheesh");

        UserService service = new UserService(mockRepo);
        assertEquals("Satheesh", service.getUsername(1));

        verify(mockRepo).findUsernameById(1);
    }
}

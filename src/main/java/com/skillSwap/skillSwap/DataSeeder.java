package com.skillSwap.skillSwap;

import com.skillSwap.skillSwap.entities.*;
import com.skillSwap.skillSwap.model.SkillType;
import com.skillSwap.skillSwap.model.SessionStatus;
import com.skillSwap.skillSwap.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class DataSeeder implements CommandLineRunner {

    @Autowired private UserRepository userRepository;
    @Autowired private SkillRepository skillRepository;
    @Autowired private UserSkillRepository userSkillRepository;
    @Autowired private SessionRepository sessionRepository;
    @Autowired private MessageRepository messageRepository;

    @Override
    public void run(String... args) throws Exception {

        // === USERS ===
        User jake = new User(null, "jake123", "jake@example.com", "pw1", "Love learning!", "Chicago", 4.5, "USER", null, null, null);
        User maria = new User(null, "maria_dev", "maria@example.com", "pw2", "Frontend dev & yoga", "SF", 4.8, "USER", null, null, null);
        User tony = new User(null, "tech_tony", "tony@example.com", "pw3", "Engineer & pianist", "NYC", 4.2, "USER", null, null, null);
        User admin = new User(null, "admin", "admin@skillswap.com", "admin_pw", "Admin user", "Remote", null, "ADMIN", null, null, null);

        userRepository.save(jake);
        userRepository.save(maria);
        userRepository.save(tony);
        userRepository.save(admin);

        // === SKILLS ===
        Skill java = new Skill(null, "Java Programming", "Tech", null);
        Skill guitar = new Skill(null, "Guitar", "Music", null);
        Skill yoga = new Skill(null, "Yoga", "Wellness", null);
        Skill piano = new Skill(null, "Piano", "Music", null);
        Skill speaking = new Skill(null, "Public Speaking", "Communication", null);

        skillRepository.save(java);
        skillRepository.save(guitar);
        skillRepository.save(yoga);
        skillRepository.save(piano);
        skillRepository.save(speaking);

        // === USER SKILLS ===
        userSkillRepository.save(new UserSkill(null, jake, java, SkillType.LEARN));
        userSkillRepository.save(new UserSkill(null, jake, guitar, SkillType.TEACH));

        userSkillRepository.save(new UserSkill(null, maria, yoga, SkillType.TEACH));
        userSkillRepository.save(new UserSkill(null, maria, guitar, SkillType.LEARN));

        userSkillRepository.save(new UserSkill(null, tony, piano, SkillType.TEACH));
        userSkillRepository.save(new UserSkill(null, tony, java, SkillType.TEACH));
        userSkillRepository.save(new UserSkill(null, tony, speaking, SkillType.LEARN));

        // === SESSIONS ===
        sessionRepository.save(new Session(null, jake, maria, guitar, LocalDateTime.of(2025, 4, 7, 17, 0), SessionStatus.DONE, "Jake was an awesome guitar teacher!"));
        sessionRepository.save(new Session(null, maria, jake, yoga, LocalDateTime.of(2025, 4, 10, 10, 0), SessionStatus.CONFIRMED, null));
        sessionRepository.save(new Session(null, tony, jake, java, LocalDateTime.of(2025, 4, 11, 19, 0), SessionStatus.PENDING, null));

        // === MESSAGES ===
        messageRepository.save(new Message(null, maria, jake, "Hey! Looking forward to our session on Friday!", LocalDateTime.of(2025, 4, 6, 12, 34)));
        messageRepository.save(new Message(null, jake, maria, "Same here! I’ll bring some guitar sheet music too.", LocalDateTime.of(2025, 4, 6, 13, 1)));
    }
}

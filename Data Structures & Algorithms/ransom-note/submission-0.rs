impl Solution {
    pub fn can_construct(ransom_note: String, magazine: String) -> bool {
        let mut count = [0; 26];

        for b in magazine.bytes() {
            count[(b - b'a') as usize] += 1;
        }

        for b in ransom_note.bytes() {
            let i = (b - b'a') as usize;

            if count[i] == 0 {
                return false;
            }

            count[i] -= 1;
        }

        true
    }
}